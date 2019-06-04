#!python
import unittest
from selenium import webdriver
from selenium.common.exceptions import NoSuchElementException
import time


class TiebaSlogan(unittest.TestCase):
    @classmethod
    def setUpClass(self):
        # start web driver, open a browser
        self.driver = webdriver.Chrome()

    def setUp(self):
        # open web page
        self.driver.get('https://tieba.baidu.com/index.html')

    def test_windows(self):
        # find element
        search_box = self.driver.find_element_by_xpath('//*[@id="wd1"]')
        search_box.send_keys('windows')
        search_box.submit()
        memNum = self.driver.find_element_by_class_name('card_menNum')
        self.assertGreaterEqual(int(memNum.text.replace(',', '')), 106700)

    def test_linux(self):
        # find element
        search_box = self.driver.find_element_by_xpath('//*[@id="wd1"]')
        search_box.send_keys('linux')
        search_box.submit()
        memNum = self.driver.find_element_by_class_name('card_menNum')
        self.assertGreaterEqual(int(memNum.text.replace(',', '')), 203900)

    def test_taiwan(self):
        with self.assertRaises(NoSuchElementException):
            # find element
            search_box = self.driver.find_element_by_xpath('//*[@id="wd1"]')
            search_box.send_keys('taiwan')
            search_box.submit()
            memNum = self.driver.find_element_by_class_name('card_menNum')
            self.assertGreaterEqual(int(memNum.text.replace(',', '')), 371700)

    def test_taiwan_warning(self):
        # find element
        search_box = self.driver.find_element_by_xpath('//*[@id="wd1"]')
        search_box.send_keys('taiwan')
        search_box.submit()
        slogan = self.driver.find_element_by_xpath(
            '/html/body/div[2]/div/div[2]/div[1]/h2')
        self.assertEqual(slogan.text, "抱歉，根据相关法律法规和政策，本吧暂不开放。")

    def test_number(self):
        # for loop to find the integral multiples of eight
        pass

    def tearDown(self):
        # print("exit")
        pass

    @classmethod
    def tearDownClass(self):
        # close browser
        self.driver.close()


if __name__ == "__main__":
    unittest.main()
