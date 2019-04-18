#!/bin/bash

sudo apt update
sudo apt remove openjdk-11-jdk-headless -y
sudo apt install git openjdk-8-jdk-headless junit4 make libmockito-java -y
