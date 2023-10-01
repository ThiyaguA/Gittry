#!/bin/bash

echo "1.) Users are : $(who | awk '{print $1'})"

echo "2.) Which User are You ? $(whoami | awk '{print $1}')"

echo "3.) Date is : $(date | awk '{print $2,$3}')"

echo "4.) Month and Year is : $(date | awk '{print $1,$6}')"

echo "5.) Time and it's Format is : $(date | awk '{print $4 , $5}')"

echo "6.) Machine Running Time With Number of Users : $(uptime | awk '{print $3,$4,"with",$5,$6}')"

echo "7.) Current File System Usage % is : $(df -H . | tail -1 | awk '{print $5}')"
