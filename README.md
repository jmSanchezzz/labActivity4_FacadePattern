# Simplified Hotel Management System

The **HotelApp** needs to manage various hotel services for guest check-in and check-out. These services include **valet parking for vehicles**, **room cleaning**, and **handling luggage carts**. However, the HotelApp aims to interact with these services through a **simplified, single interface** provided by the **FrontDesk**.

The **FrontDesk** class delegates client requests to the appropriate service classes (`Valet`, `HouseKeeping`, and `Cart`) while abstracting the service details from the client.

---

## Class Definitions

* **HotelService (Interface)** – Defines the common interface for all hotel services.
* **Valet** – A service class implementing the `HotelService` interface, responsible for vehicle valet parking and pick-up. It includes the `pickUpVehicle(plateNumber)` method.
* **HouseKeeping** – A service class implementing the `HotelService` interface, responsible for room cleaning. It includes the `cleanRoom(roomNumber)` method.
* **Cart** – A service class implementing the `HotelService` interface, responsible for handling luggage cart requests. It includes the `requestCart(numberOfCarts)` method.
* **FrontDesk** – The **facade class** that coordinates interactions between the client (`HotelApp`) and the individual hotel services.
* **HotelApp** – The **client class** that uses the `FrontDesk` facade to access and utilize hotel services seamlessly.

---

## UML Diagram (Text-Based)

```

```

---

## Design Pattern

This implementation demonstrates the **Facade Pattern**, which provides a unified interface to a set of interfaces in a subsystem.
The **FrontDesk** acts as a **facade**, simplifying interactions between the `HotelApp` (client) and various hotel services.
