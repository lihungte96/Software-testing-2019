from selenium import webdriver
import time

# start web driver, open a browser
driver = webdriver.Chrome()
# open web page
driver.get('http://www.google.com/xhtml')
# find element
search_box = driver.find_element_by_name('q')
search_box.send_keys('NCTU')
time.sleep(2)  # Let the user actually see something!
search_box.submit()
time.sleep(5)  # Let the user actually see something!
driver.close() # close browser