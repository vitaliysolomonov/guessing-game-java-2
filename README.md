# Java Guessing Game
Let's create a guessing game using *Java*, *Gradle*, and *IntelliJ IDEA*! The user will type a number into the terminal when running our application. When the user hits enter, we'll check that number against a randomized number. If the user's inputted number matches the randomized number, we'll congratulate them. If the numbers do not match, we'll prompt the user to take another guess.

<hr/>
### Feature 1: Guess Once
Using `Prompt.present()`, write a program that asks the user to guess a number and then tells them if they were correct or not.<br/><br/>
**Input Example:** 7<br/>
**Output Example:** "Not correct, that wasn't the right guess!"<br/>
<hr/>
### Feature 2: Give a Hint
When the user guesses we want to give them the sensation that they are getting "hotter or colder". Therefore, update the example output to reflect a hint telling users to guess higher or lower based on their guess.<br/><br/>
**Input Example:** 4<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
<hr/>
### Feature 3: Use a Loop for Contiguous Guessing
Using `while()` or a similar looping feature, continually allow the user to guess until they guess the right number.<br/><br/>
**Input Example:** 3<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
**Input Example:** 4<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
**Input Example:** 5<br/>
**Output Example:** "Congrats! You guessed correctly, the number was 5!"<br/>
<hr/>

### Have Extra Time? Feel free to add an extra feature in your game!
You might want to add a number that limits the times the user can guess. Or perhaps you want to add more messages based off of how the user is guessing? It's your project so feel free to tinker with it further, time permitting!
