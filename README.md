# Assignment 2 — Vehicle Management System
#MYRZABEKOV RAKHAT
## Project Overview
This project is a Vehicle Management System implemented in Java.
It demonstrates key object-oriented programming principles such as
inheritance, abstraction, composition, aggregation, and method overriding.

An abstract Vehicle superclass is used as a base for different vehicle types,
while a Driver class represents drivers associated with vehicles.

---

## Class Hierarchy

### Vehicle (abstract class)
Fields:
- brand (String)
- year (int)
- driver (Driver)

Methods:
- startEngine() — abstract
- stopEngine() — abstract
- displayInfo() — concrete method

### Car (extends Vehicle)
Additional fields:
- doors (int)
- fuelType (String)

Overrides engine start and stop methods.

### Motorcycle (extends Vehicle)
Additional field:
- hasSidecar (boolean)

Overrides engine start and stop methods.

### Truck (extends Vehicle)
Additional fields:
- capacity (double)
- numAxles (int)

Overrides engine start and stop methods.

### Driver
Fields:
- name (String)
- licenseNumber (String)

One driver can be associated with multiple vehicles.

---

## OOP Principles Used
- **Inheritance**: Car, Motorcycle, and Truck inhe
