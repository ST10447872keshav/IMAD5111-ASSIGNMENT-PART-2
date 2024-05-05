COMPANION APP ST10447872 KESHAV ADITYA PREETHLAL Companion App

An engaging virtual pet game is featured in this Kotlin Android project. To play with, feed, and wash a virtual pet, players have to press buttons. The pet's levels of happiness, hunger, and neatness are all affected by each activity. The main activity where the interactive pet game is put into effect is shown by the following line of code.

MainActivity.Kt

main activity class

Because it implements AppCompatActivity, this activity class may be used to represent a screen in an Android application that uses the AppCompat library to maintain backward compatibility with earlier Android versions.

Member Variables user interface Element:

startButton: A Button instance that uses the lateinit keyword to initialize itself later. With the understanding that a variable would be initialized prior to use, this method permits variable declaration without initialization.

the onCreate Process

When an activity is created, it is configured here. Here's what transpires in detail:

activity iniliatization:

super.onCreate(savedInstanceState): Normally, this method calls the parent class's onCreate function to guarantee that the activity is initialized correctly.

enableEdgeToEdge(): To allow edge-to-edge layout, a design approach seen in contemporary Android applications, call this custom method. Often, it means making use of the whole screen.

MainActivity.Kt.2

The structure

The main components

User Interface:

The buttons that indicate user activities to play, wash, or feed the pet are called play, bathe, and feed buttons.

ImageView: petImage: Shows the pet's visible condition.

TextView: a bathTextView, playTextView, feedTextViewT: Shows the current state of the pet (neatness, hunger, and happiness).

variables:

petImages: Drawable resource IDs for different pet states are stored in this array.

happiness, hunger, and neatness: Note the pet's current emotional state, level of hunger, and level of cleanliness, in this order.

OnCreate Method

The following actions take place when the activity is created:

To initialize the user interface components, identify and store all references to the ImageView, TextViews, and buttons using their IDs.

Set the starting text and picture values for the pet's cleanliness, contentment, and hunger. Initialize Pet State.

Configure Button Click Listeners: Assign the buttons OnClickListener methods so that they will start to operate when the user interacts with them.

Update Pet Status

The user action (button push) is processed by the updatePetStatus(action: Int) function, which then modifies the UI components and pet's status.

One (Feed) action changes the pet's looks to a "feeding" situation.

raises satisfaction by five and hunger by ten (pet becomes full).

Reduces neatness by five.

2 (Bathe): Changes pet's looks to a "bathing" position.

Five less happy moments (some pets don't enjoy to bathe).

Reduces appetite by five; improves neatness by ten.

3 (Play): Changes the pet's picture to a "happy" one.

reduces hunger by five, decreases neatness by five, and increases happiness by ten.

Interface Update: TextViews are updated to show the happiness, hunger, and neatness levels at any given time.

Youtube link

https://youtu.be/KojG4ZGodr0
