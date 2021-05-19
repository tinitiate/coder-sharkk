import pyautogui
import time
import random
while True:
    pyautogui.moveTo(random.randint(0, 1919), random.randint(0, 1079))
    pyautogui.scroll(3)
    time.sleep(random.randint(240, 255))
    # time.sleep(5)
 