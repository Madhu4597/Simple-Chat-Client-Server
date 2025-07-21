# Java Socket Programming: Client-Server Chat Application

A **simple client-server chat application** built using Java sockets.  
This project demonstrates real-time messaging between a client and a server over TCP/IP using basic Java I/O and networking classes.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [How It Works](#how-it-works)
- [Installation & Running](#installation--running)
- [Usage](#usage)
- [Acknowledgements](#acknowledgements)

---

## Overview

This Java socket programming project provides an interactive, console-based chat between a single client and server. The server listens on a specified port for incoming connections, and the client connects by specifying the server's IP address and port. Both sides can exchange messages in real time, with auto-flushing for immediate output.

---

## Features

- **Bi-directional Messaging:** Both client and server can send and receive messages interactively from the console.
- **Auto-Flushing Output:** Ensures sent messages are delivered without delay.
- **Continuous Communication Loop:** Both programs allow continuous exchange of messages until terminated by input.
- **Basic Error Handling:** Exceptions are caught and printed for troubleshooting.
- **Graceful Exit:** User-selectable option to continue chatting or disconnect.

---

## Technologies Used

- **Java (JDK 8 or higher)**
- **Java.net** (Socket, ServerSocket)
- **Java.io** (BufferedReader, PrintWriter, InputStreamReader)
- **java.util.Scanner**

---


---

## How It Works

- The **server** starts first, listening on a configurable port (`16000` used by default).
- The **client** connects by providing the server's IP and the same port number.
- Once a connection is established:
    - Client types a message and sends it to the server.
    - Server reads the client's message, displays it, and sends a response.
    - Client displays the server's reply.
    - Both programs repeat this exchange until the user decides to exit.

---

## Installation & Running

1. **Compile Both Programs**
    ```
    javac Server.java
    javac Client.java
    ```

2. **Start the Server**
    ```
    java Server
    ```
   - The server waits for incoming client connections on port 16000.

3. **Start the Client**
    ```
    java Client
    ```
   - The client attempts to connect to the server at the specified IP (`122.164.89.188`) and port (`16000`).

**NOTE:** Run the server and client on the same machine (localhost/127.0.0.1) or on different machines within the same network by updating the IP in `Client.java`.

---

## Usage

- On each side, enter messages or responses into the console prompt.
- After each message, you'll be prompted to continue (`1`) or stop (`0`).
- Enter `0` to end the chat and close the socket.

---

## Acknowledgements

- Inspired by classic Java socket programming tutorials and coursework examples.
