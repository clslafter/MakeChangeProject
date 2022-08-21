# Make Change Project

## Description
This program takes in a price for a particular item and the amount a customer tendered. Then, it returns the amount of change due and breaks it down into the highest common denominations of dollar bills and change from twenties down to pennies.

To get the results, after running the program, input the price and amount tendered as requested.

## What I learned
In this project, I learned that integers need to be forced to achieve the correct number of denominations. I also learned, through Googling, how to restrict the change due amount to two decimal points.

I had trouble trying if, else statements to try to get the denominations to show up on one line and separated by commas in the appropriate places, so I chose to list them on separate lines, instead.

I wonder if there might be a possibility for a loop and switch statements, but the program works with a series of instructions using new variables for each new denomination and then recalculating the new amount of change for the next denomination.

I also learned that for nickels and pennies, for some reason, in a couple of the test cases, the change amount wasn't correct because it would end in a .9999999etc, so I forced an addition of 0.001 to get the proper number of nickels and pennies. It did not seem to affect any of the other test cases.

### Technologies Used
Java, Eclipse, Git,
# MakeChangeProject
