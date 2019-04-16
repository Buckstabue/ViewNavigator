# ViewNavigator
A library for navigation based on View classes. It's an alternative to android fragments. 
The difference are:
1. View backstack is not restored when an activity state is restored.
2. Previous controller is fully dropped after new screen is placed onto backstack, whereas android fragment is kept in memory. It makes it easier to do memory management. In fragments you should release any view references in onDestroyView()
