#!/bin/bash

sudo apt update
sudo apt install openjdk-8-jdk-headless junit4 make
export CLASSPATH=/usr/share/java/junit4.jar:.
