

/*
import java.util.Scanner;
class Node {
int data;
Node next;
public Node(int data) {
this.data = data;
this.next = null;
}
}
class SinglyLinkedList {
Node head;
public void addNode(int data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
} else {
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newNode;
}
}
public void display() {
Node temp = head;
while (temp != null) {
System.out.print(temp.data + " ");
temp = temp.next;
}
System.out.println();
}
public void insertAtFront(int data) {
Node newNode = new Node(data);
newNode.next = head;
head = newNode;
}
public void insertAtEnd(int data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
} else {
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newNode;
}
}
public void insertAtPosition(int data, int position) {
Node newNode = new Node(data);
if (position == 1) {
insertAtFront(data);
} else {
Node temp = head;
for (int i = 1; i < position - 1; i++) {
temp = temp.next;
}
newNode.next = temp.next;
temp.next = newNode;
}
}
public void deleteFirst() {
if (head == null) {
System.out.println("List is empty");
} else {
head = head.next;
}
}
public void deleteAtEnd() {
if (head == null) {
System.out.println("List is empty");
} else if (head.next == null) {
head = null;
} else {
Node temp = head;
while (temp.next.next != null) {
temp = temp.next;
}
temp.next = null;
}
}
public void deleteAtPosition(int position) {
if (position == 1) {
deleteFirst();
} else {
Node temp = head;
for (int i = 1; i < position - 1; i++) {
temp = temp.next;
}
temp.next = temp.next.next;
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
SinglyLinkedList list = new SinglyLinkedList();
int choice;
do {
System.out.println("1. Add node");
System.out.println("2. Display list");
System.out.println("3. Insert at front");
System.out.println("4. Insert at end");
System.out.println("5. Insert at position");
System.out.println("6. Delete first");
System.out.println("7. Delete at end");
System.out.println("8. Delete at position");
System.out.println("9. Exit");
System.out.println("Enter your choice: ");
choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.println("Enter data: ");
int data = scanner.nextInt();
list.addNode(data);
break;
case 2:
list.display();
break;
case 3:
System.out.println("Enter data: ");
data = scanner.nextInt();
list.insertAtFront(data);
break;
case 4:
System.out.println("Enter data: ");
data = scanner.nextInt();
list.insertAtEnd(data);
break;

 */
