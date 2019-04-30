# Gedcom task
Your job today is to work with Genealogical Data Communication AKA. Gedcom.

This file is essentially an ansestory tree. It has information about individuals and their families.

You need to read in that file, process it and split it into either a person or a family.

## Menus
The menus will be partly done for, this is so the only thing you need to work on is the actual parsing of the file itself.

## Layout
The layout of the files is almost entirely done for you. The hashmaps, the classes are all done for you.

Your job is to just read in the file and sort them into their specific classes (person or family). So then when we use the display menus,
we can see the information on the family.

## Important information.
 - You **MUST** use files provided.
 - You **CANNOT** download code from sites and other projects. It all must be your own.
 - You **CAN** ask me some... questions. Also googling how to do things is ok.

Also, the file is provided in the `gedcom` directory of this project.

## GEDCOM information
Here are a few sources for information on the gedcom file format.
 - [WHAT A GEDCOM FILE IS](https://en.wikipedia.org/wiki/GEDCOM)
 - [THE FORMAT OF THE FILE](http://user.it.uu.se/~andersa/gedcom/ch2.html)
 - [HOW INDIVIDUALS ARE FORMATED](http://user.it.uu.se/~andersa/gedcom/ch2.html#SINDIVIDUAL_RECORD)
 - [HOW FAMILIES ARE FORMATED](http://user.it.uu.se/~andersa/gedcom/ch2.html#SFAMILY_RECORD)

## A little helper.
Use the number to the left of each line as an indent count. The larger the number, the more indented it is.
This will help you with reading the file to see how it works.

I have also removed the header of the file.
So you will start with reading in the first person.

## What to ignore
If the event is not one of the following, we will add it to the `events` map inside the person.
~~~
    BIRT
    DEAT
    MARR
~~~

(FAMC & FAMS etc are not events)

## key map
~~~
    BIRT : Birthdate (event)
    DEAT : Death (event)
    FAMC : Child of a family
    FAMS : Spouse of family
    PLAC : Location
    OBJE : OBJECT
    FILE : File object
    INDI : Individual (This represents that you are now parsing a person)
    MARR : Marriage
~~~
