@vendor
Feature: create a new vendor

Scenario:  verify column names
Given     User is on the log in page
And       User logs in….
Then      User navigates to “Purchases” then to “vendors”
And       User clicks on create button
Then      User adds new vendor  information
And       User clicks create button