# Java Socket Programming Project

This project demonstrates the use of Java Socket Programming to build a simple client-server application. The primary objectives of this project are:

1. Create multiple clients that can interact with the server using a Thread Pool.
2. Configure the server so that clients can talk to each other through the server.

## Table of Contents

- [Project Overview](#project-overview)
- [Task 1: Multiple Clients](#task-1-multiple-clients)
- [Task 2: Client-to-Client Communication](#task-2-client-to-client-communication)
- [Distributed System Integration](#distributed-system-integration)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

Java Socket Programming allows communication between applications over a network. This project demonstrates how to create a simple client-server architecture and enhance it to support multiple clients and client-to-client communication.

## Task 1: Multiple Clients

In this task, we create a server that can handle multiple clients simultaneously. We use a Thread Pool to efficiently manage client connections. Each client runs in its own thread, allowing multiple clients to interact with the server concurrently.

### Implementation Details

- The `Server` class sets up a ServerSocket to listen for incoming client connections.
- The `ThreadPool` class manages a pool of worker threads.
- Clients connect to the server, and the server assigns a worker thread from the pool to handle each client's requests.

## Task 2: Client-to-Client Communication

Building upon Task 1, we enhance the server to support client-to-client communication. Clients can send messages to the server, and the server relays these messages to the intended recipient client.

### Implementation Details

- Clients can send messages to the server specifying the recipient client.
- The server receives messages, identifies the recipient client, and forwards the message to that client.

## Distributed System Integration

This project showcases the foundations of a distributed system. A distributed system consists of multiple interconnected components that communicate and coordinate their actions to achieve a common goal.

- The `Server` in this project serves as a central component that manages client connections and facilitates communication.
- Clients represent distributed nodes that can send and receive messages, demonstrating the core concept of distributed communication.

## How to Run

1. Clone this repository to your local machine.
2. Compile the Java files using `javac`:
3. Start the server:
4. Run multiple clients:
5. Interact with the server and between clients to test the functionality.

## Contributing

Contributions to this project are welcome! Feel free to open issues or submit pull requests for improvements, bug fixes, or new features.

## License

This project is licensed under the [MIT License](LICENSE).
