# MonthlySalesTax

/*A retail company must file a monthly sales tax report listing the total sales for the month, and the amount of state and county sales tax collected. 
 The state sales tax rate is 4% and the county sales tax rate is 2%. 
 Create a GUI application that allows the user to enter the total sales for the month into a text field. 
 From this figure, the application should calculate and display the following: 

*	The amount of county sales tax (2%)
*	The amount of state sales tax (4%)
*	The total sales tax (county plus state) 
In the application’s code, represent the county tax rate (0.02) and the state tax rate (0.04) as named constants.

 */
 
 
 Line 79 - 81 had the TextFormatter methods, which limits the user to enter only certain elements/keys in the textField so no error occurs,
 and so that the application can make sense. This program is dealing with numbers specifically money so therefore only numbers should be inputted.
 Since money deals with whole dollars and cents, the user is also allowed to enter one decimal to make the app flexible for user to be specific 
 as to the exact amount they would like to enter.
 
 Lines 79 - 81 may not work for every user that tries this application out. If issues occur with your compiler, feel free to delete those
 lines of codes as not everybody's JDK is up to date to recognize the textFormatter methods. 
