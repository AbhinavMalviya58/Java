# HashTables in Java

## What is a HashTable?

It is a data structure that helps storing data in key-value pairs and thread-safe.
The key in the table is unique and the pairs may or may not be unique depending upon the type of input.
These are considered good for learning the hash structures.
The most basic example can be that a student record being stored as a key-value pair, where key is the roll number (unique identifier) and value is their name (may or may not be the same). 
To undersand its mechanism more clearly, here is a simple code demonstration that describes the working of hashtables so you will know when to use this data structure. 

## Features:

### Map Interface: 
It contains the necessary methods needed to be implemented for creating a Hashtable.

### HashTable Constructor:
It takes the capacity as an input from the user or the intial size for the table.
Its not mandatory to provide the input as we have another constructor (Hashtable.java, line: 18) which by default set an initial capacity of the table to 100.
There is another constructor above which takes *loadfactor* as well. LoadFactor is used to calculate the probablity of a Table being full (75% is set by default).

### size(): 
Returns the size of table.

### hash():
The hash method is used for generating random indices for storing and retrieving the key-value pairs.
It generates index by taking the *hashCode* of the key provided (hashCode() is method of Object class in java) and using logical *AND* operating with the value '0x7FFFFFFF' so that only positive indices are generated and finally using modulo operator with the length of the table.

### nextProbe():
This method is used for traversing over the table.

### get(): 
The indices in a hastable are generated randomly.
After receiving the parameter (key in this case), the *hash()* method is called to generate the index of that particular key. 
We search the whole table (ignoring the null and used spaces) and return the value once the value of the particular key is found.

### put():
Used for storing the key-value pairs. First it checks if the usage of the table is greater than the *loadfactor* set and if its true, it automatically calls *rehash()* method.
Then it traverses the table and ignores the spaces which were already used by previous pairs by using the dummy NIL entries.
Once any empty space (NULL in this case) is found, we automatically create a new object there for our next provided pair and increase the size variable.
If the key is seemed to match another key present in the table already, we only swap the old value with the new value.

### remove():
Used for deleting the values in a hashtable.
It takes a key as parameter and first checks if the provided space in table is NIL, then continue traversing because its not the end of table.
If the space is null, then break from the loop because there can't be more elements further.
If the key matches, we replace the old entry with NIL object to specify that this space has been used and decrease the size variable.

### rehash():
This is called once the used space in the hashtable exceeds the *loadfactor*.
It copies the old entries to the new table and increase the size of original table twice the original size.
It then genertaes new indices to copy the entries back to the old table.
All the NULL and NIL spaces encountered are ignored and at the end it generates a more clean hashtable with much space.
 **Advantage:** Best for handling large inputs and avoid the collision in the hashtable.