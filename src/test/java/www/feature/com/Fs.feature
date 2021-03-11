Feature: Login status Check

Scenario: Customer login to the site
Given Customer select sign in option
When Customer enter username and password
And Customer click login button
Then Customer logged in to site and verify username



