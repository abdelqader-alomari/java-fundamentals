# java-fundamentals

## basiclibrary

There are a lot of directories and files inside basiclibrary which built using gradle 7.1.1 from ubuntu
and the lab solved on IntelleJ... inside basiclibrary there are .gradle, .idea, gradle, lib directories
and .gitattributes, .gitignore, gradlew, gradlew.bat, and settings.gradle files
in lib >> src >> there are main directory which contains Library.java and test directory where is LibraryTest.java

Methods inside basiclibrary>>lib>>src>>main>>java/basiclibrary>>Library.java:

**Main** that contain these methods:

| Method             | Description                                                                                                     |
| ------------------ | --------------------------------------------------------------------------------------------------------------- |
| roll               | return an array of rolls a six-sided dice n times.                                                              |
| containsDuplicates | returns true or false depending on whether the array contains duplicate values.                                 |
| average            | accepts an array of integers and calculates and returns the average of all the values in the array.             |
| lowestAverage      | Accept array of arrays calculate the average value for each array and return the array with the lowest average. |

---

# Lab: 06 - Inheritance and Interfaces

## Classes in this lab:

Library, Restaurant, Review

## Fields

**For Restaurant:** name, rate, priceCategory

**Review:** body, author, starsNumber

## Methods:

Review, Getters, toString, addReview, updateStars

---

# Lab: 07 - Inheritance, day 2

## Classes in this lab:

Library, Restaurant, Review, Shop, Theater, and PlaceReview

## Fields

**PlaceReview:** name, rate, priceCategory

**For Restaurant:** inherit all fields from `PlaceReview

**Review:** body, author, starsNumber

**Shop:** Inherit all fields from PlaceReview + description

**Theater:** Inherit all fields from PlaceReview + ArrayList of movies

## Methods:

Review, Getters, toString, addReview, updateStars for all Restaurant, Shop and Theater

For Shop: what mentioned above + get and set a values to the descriptions.

For Theater: what mentioned above + get and set a values to the descriptions. + addMovie : check if movie is not already exist if not add it to movies list.
removeMovie : remove movie from movies ArrayList.
Getter : Get the values of moviesList.
