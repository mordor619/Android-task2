# Android-task2

modify the application, so each new user would have their separate click counter. In the above scenario, it must be:
- user clicks button 3 times -> user sees 'Nishanth clicked 3 times' message  // 3 times, not 8 times in total

------


This means, you will need facilities to keep the count of clicks for each user. Kotlin map data structure is very convenient for it.
Check Kotlin documentation, Map section: https://kotlinlang.org/docs/collections-overview.html#map


Map with key as a user name, and value as a count of clicks might help you in this task.
In the scenario above, when Michael clicked 5 times and Nishanth clicked 3 times, you will have a map with two keys: "Michael" and "Nishanth". Value for "Michael" key will be 5, value for "Nishanth" key will be 3.
