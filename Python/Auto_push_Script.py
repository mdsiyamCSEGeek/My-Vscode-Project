import os
import datetime

def log(msg):
    with open("logs/auto_push_log.txt", "a") as f:
        f.write(f"{datetime.datetime.now()} - {msg}\n")

log("Running auto push")
os.system("git add .")
os.system('git commit -m "Auto Push from Script"')
os.system("git push origin main")
