# Liner Search
Add a Linear search using JAVA language.

# About Linear Search
Linear Search is the simplest searching algorithm. It traverses the array sequentially to locate the required element. It searches for an element by comparing it with each element of the array one by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection.

![linear_search](https://user-images.githubusercontent.com/35636662/141829537-a0f46e10-5095-4099-b1ac-17fb68ec26c0.gif)

#Java

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println(value + " is found at index: " + i);
            }
        }
