## Make Change Project

### First week homework for Skill Distillery

### Overview

This program simulates a cash transaction interface.  A user will input a total purchase price.  Also, the user is prompted to input the amount paid.  This will give the amount of change in dollars and cents owed.  It prints in an order so the least amount of change is used.  $2 bills were not implemented into this program, but they could easily be included by adding on to three lines of code.  If the amount owed is less than the purchase price, the program will give an error message with the difference required.

Example run:
```
Amount charged: 37.50
Amount paid: 50.00
Amount 37.50, Tendered: 50.00, Result: 1 ten dollar bill, 2 one dollar bills, 2 quarters.
```

### How to run

The program can be run by downloading the code into a known folder.  Navigate to that folder in terminal and run `javac MakeChangeApp.java` to compile the Java file.  After compiled into a .class file, type `java MakeChangeApp` in order to run the program.

### Technologies/ topics used

This project used Java.

Topics included methods, if else conditionals, for loops, while loops, data types, and arrays.

### Lessons Learned

The original code, which can be viewed in previous commits, had a long while loop with if else conditionals to calculate the change amount.  The program worked, but there was a fundamental flaw that each if/if else conditional had 5 lines of copy and pasted code that worked the same way.  One issue this caused while debugging was running into an infinite loop because I missed changing the int variable from "twentyDollar" to "tenDollar".  This error can be seen on line 44 and 45 on commit [bc2cda6](https://github.com/zsaylors/MakeChangeProject/commit/bc2cda6d0a1db07d204d69d12c9ffec2d266d59e3 "Previous GitHub Commit").

In spirit of DRY, one solution I tried was to assign variables amount1 = 20.00, amount2 = 10.00, etc.  I was going to iterate through a for loop by adding the equation `amount + i`.  After some Googling, I found that Java does not have dynamic variables, and the best solution would be to add an array.  Arrays are out of the scope of this past weeks topics, but I finished additional Java The Hard Way exercises during the prework which covered arrays.  Therefore, I attempted to implement an array to call amount[i], allowing me to accomplish what I was trying by using amount + i.

This change allowed it to be easier to add higher denominations of currency such as $50 and $100 by only changing three lines.  It reduced the chance of running into errors by human oversight. Also, the lines of uncommented code were reduced from 77 to 33 in the calculation method.

Since arrays are out of scope of this past weeks topics, the old while loop can be found in the second to last commit.

An additional lesson learned includes formatting doubles in printf.  Since cents are normally represented with two digits after the decimal, %.2f was added within double quotes in order to add two decimal spaces.
