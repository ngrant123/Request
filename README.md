# Request
Code for the elevator simulation 

Elevator simulation 

Although the output of this program was not what I want it to be, I thought it would helpful to show me 
using Stacks and Queues in a program. The purpose of this program is to perform simulation of a building's
elevator system that processes passenger requests. The user will have to input the number of floors in 
the building, the number of elevators, the simulation length in time units, and the percent chance that a 
passenger will place a new elevator request during each time unit. 

The Request class is used to initialize the object and contains the source floor, the destination floor,
and the time entered. On the other hand, the Node class uses the Request class and stores Request objects.
It is used to to implement a LinkedList. 

The RequestQueue class extends from the Node class and is used to add the requests onto a Queue. There
is also an isEmpty method that will check if the Queue is empty. The BooleanSource class is used to check
the probability that the user request will arrive in the program. The requestArrived method uses Math.random
to generate a random number to means the probability. 

The Elevator class is stores all of the Request objects in it. It contains methods that return the current 
floor, the elevator state, and other methods. The Simulator class uses the previous class to create the actual
simulation of the elevators.The class contains a static method that accepts four parameters in it. The fours
parameters are the probability of the request, the numbers of floors in the building, the number of elevators,
and the length of the simulation. 

Lastly the Analyzer class contains a main method which prompts the user, on separate lines, for each of the 4 
parameters required for the simulate method of the Simulator class. 



