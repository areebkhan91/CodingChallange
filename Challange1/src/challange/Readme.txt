Randomize - Prime

Design:
Four classes - Randomize,Prime, App(runs the application), Result(POJO)

Two static Blocking Queues - One holds numbers, one holds the results.(Named queue and results)
Result class has the number and the boolean which says whether it is prime.

It accomplishes the task by multithreadding.

fillRandom function in Randomizer class fills random value in the queue.
print function in Prime class removes the head from queue, eavluates if the number is prime
and saves the result in result queue

fillRandom along with filling the queue also reads from resluts and prints the 
number and the boolean value

Sample Output:
4438 false
8818 false
294 false
6491 true
1849 false
2618 false
1056 false
6221 true

