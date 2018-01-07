# Exchanger-Client #

Java financial exchange client.

- [Exchanger-Client](#exchanger-client)
    - [Purpose](#purpose)
    - [Overview](#overview)
        - [Order processing](#order-processing)
        - [Daily Updating](#daily-updating)
        - [Company discovery](#company-discovery)
        - [Authentication](#authentication)
    - [Communication](#communication)
        - [Client <-> Front-end](#client---front-end)
        - [Client <-> Exchange](#client---exchange)
    - [Dependencies](#dependencies)

---------

## Purpose ##

Is to connect the exchange clients to the exchanges in which they'd like to trade as well as supply real-time or daily aggregate information as needed.

Must also handle authentication of the client against the front-end server.

---------

## Overview ##

### Order processing ###

[Described here](https://github.com/Seriyin/Exchanger-Server#order-processing)

Client must:

- Inform front-end of intended trade orders.
- Receive trade completion replies.
- Display trade completion replies to user.
- Request front-end server for exchange addresses to connect to for direct subscription.
- Subscribe to exchanges for real-time trade updates.

---------

### Daily Updating ###

Client can ask front-end server for the current or previous day aggregate information of exchange trading for a given company.

Client must:

- Request current or previous day information from the front-end server.
- Display that structured information to the user.

---------

### Company discovery ###

Client can ask front-end for a global company listing by exchange negotiated in.

Client must:

- Request global exchange listing from front-end server.
- Request global company listing from front-end server.
- Display that structured information to the user.

---------

### Authentication ###

Authentication will be based on regular unique username + password pair convention.

These features are required to implement it:

- Allow client account creation.
- Alert client of username conflict on creation.
- Allow client login.
- Alert client of unexistant/incorrect credentials.
- Alert client on successful login.
- List available trading operations on successful login.

## Communication ##

_Serialization of all trade, consultation and login information will be handled through the use of [Protocol Buffers](https://github.com/google/protobuf)._

### Client <-> Front-end ###

    Communication will be bidirectional between client and front-end server and client and exchanges.

### Client <-> Exchange ###

    Communication will occur on a pub-sub pattern over the appropriate ZeroMQ sockets.

---------

## Dependencies ##

- Native Java implementation of [Protocol Buffers](https://github.com/google/protobuf).
- [Java native implementation of ZeroMQ](https://github.com/zeromq/jeromq).

Dependencies are resolved using [Maven](https://maven.apache.org/).
