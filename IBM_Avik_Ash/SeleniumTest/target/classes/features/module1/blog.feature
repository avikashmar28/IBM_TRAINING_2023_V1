Feature:Blog
Scenario Outline: Validate Search functionality 
Given user is in Search page
When user enters "<product>" product
And Click on Search button
Then Product should be displayed
Examples: | product | | avikashmar28@gmail.com | | MacBook Air | | MacBook Pro |