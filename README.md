Freud
=====

## Introduction

Freud is a Java library for psychometric test analysis.

## Updates

+ Added agent's IO and agent's ID format [2014-08-30]
+ Almost complete data structure for all agent types [2014-08-30]

## Notes

+ Id format: Id format consists several parts: MAC address of the machine, agent's identifier, registration date, agent's queue number. For visitor, it needs also the therapist's partial id to indicate their relationship.
  ```
  [MAC address]--[A|PSY|V][Registration date]--[Queue number]--{Optional: if V}[PSY PART ID]
  ```

## Contacts

Hu Yuhuang

_No. 42, North, Flatland_

Email: duguyue100@gmail.com
