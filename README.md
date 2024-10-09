# Coffee Machine Simulator
This Java-based Coffee Machine Simulator models the behavior of a real-world coffee machine by organizing its components into well-structured classes. Each class represents different aspects of the machine, such as the coffee types and their ingredients, the machine's resources, and user actions like making coffee, refilling supplies, and cleaning the machine.

# Features:
Coffee Types: Supports three types of coffee:

-> Espresso: Requires 250 ml of water, 16 g of coffee beans, and costs $4.
-> Latte: Requires 350 ml of water, 75 ml of milk, 20 g of coffee beans, and costs $7.
-> Cappuccino: Requires 200 ml of water, 100 ml of milk, 12 g of coffee beans, and costs $6.
-> Resource Management: Tracks the machine's available resources, including water, milk, coffee beans, disposable cups, and the collected cash.

User Actions: Supports six user actions:

buy: Choose a coffee to buy, as long as the machine has sufficient resources.
fill: Refill the machine with water, milk, beans, and cups.
take: Take out the collected cash.
clean: Clean the machine after 10 cups of coffee are made.
remaining: Display the current resources.
exit: Shut down the machine.
Cleaning Requirement: After every 10 cups of coffee, the machine will require cleaning before it can continue making more coffee.

# Class Structure:
CoffeeType Class: Represents a coffee type with its required water, milk, coffee beans, and price.
CoffeeMachine Class: Manages the machine's operations and tracks resources. It also processes the actions entered by the user.
# CoffeeMachineApp: Handles user interaction and orchestrates the machine's actions through its menu.
Initial Resources:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of initial cash
# How it Works:
The coffee machine processes user actions and updates its state based on the available resources.
If resources are insufficient for a chosen coffee type, an error message is displayed.
After every 10 coffees, the machine requires cleaning before it can brew more.
# Objective:
This project demonstrates object-oriented programming (OOP) principles, clean code structure, and simulates real-world machine operations through interactive commands.
