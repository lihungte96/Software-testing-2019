from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.common.exceptions import NoSuchElementException
import time
import base64

url_list = ["https://www.facebook.com/DoctorKoWJ/",
            "https://www.facebook.com/twherohan/", "https://www.facebook.com/TerryGou1018/",
            "https://www.facebook.com/chingte/", "https://www.facebook.com/tsaiingwen/"]


def main():
    options = webdriver.ChromeOptions()
    options.add_argument("--disable-notifications")

    # Start new web browser
    global driver
    driver = webdriver.Chrome(options=options)
    facebook_login()
    # unlike()
    # like()
    driver.close()


def facebook_login():
    driver.get('https://www.facebook.com')
    email_box = driver.find_element_by_xpath('//*[@id="email"]')
    pass_box = driver.find_element_by_xpath('//*[@id="pass"]')
    email_box.send_keys('user@dns.com')
    file = open("password.txt", "r")
    password = file.read()
    # print(password)
    pass_box.send_keys(password)
    login_box = driver.find_element_by_xpath(
        '//*[@id="login_form"]/table/tbody/tr[2]/td[3]/label')
    login_box.click()


def unlike():
    for url in url_list:
        driver.get(url)
        time.sleep(2)  # Let the user actually see something!
        try:
            like_box = driver.find_element_by_xpath(
                '//*[@id="u_0_z"]/div[2]/div/div/div/div/div/div/a')
            # like_box.click()
            ac = ActionChains(driver)
            ac.move_to_element(like_box).move_by_offset(
                0, 30).click().perform()
            time.sleep(1)  # Let the user actually see something!
        except NoSuchElementException:
            print("already unlike")


def like():
    for url in url_list:
        driver.get(url)
        time.sleep(2)  # Let the user actually see something!
        try:
            like_box = driver.find_element_by_xpath(
                '//*[@id="u_0_10"]/div/div/div[1]/div/span/button')
            like_box.click()
        except NoSuchElementException:
            print("already like")


if __name__ == '__main__':
    main()
