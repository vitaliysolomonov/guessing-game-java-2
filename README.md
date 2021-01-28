# Java Guessing Game
Let's create a guessing game using *Java*, *Gradle*, and *IntelliJ IDEA*! The user will type a number into the terminal when running our application. When the user hits enter, we'll check that number against a randomized number. If the user's inputted number matches the randomized number, we'll congratulate them. If the numbers do not match, we'll prompt the user to take another guess.


### Feature 1: Guess once. (With a hint.)
Using `args` or `Prompt.present()`, write a program that asks the user to guess a number and then tells them if they were correct or not. When the user guesses we want to give them the sensation that they are getting "hotter or colder". Therefore, update the example output to reflect a hint telling users to guess higher or lower based on their guess.<br/><br/>
**Input Example:** 4<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
<br/><br/>
### Feature 2: Guess again! (Use a loop for contiguous guessing.)
Using `while()` or a similar looping feature, continually allow the user to guess until they guess the right number. Check Your Work! Test out your code, make sure everything is working correctly. Also make sure you don’t see any errors in console.
<br/><br/>
**Input Example:** 3<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
**Input Example:** 4<br/>
**Output Example:** "Not correct, try guessing a higher number!"<br/>
**Input Example:** 5<br/>
**Output Example:** "Congrats! You guessed correctly, the number was 5!"<br/>
<br/><br/>
### Feature 3: How Many Tries? (Count the number of attempts.)
Once the user guesses the correct answer, let’s add a feature that tells them how many guesses it took them until they made the correct guess.
<br/><br/>
...<br/>
**Input Example:** 5<br/>
**Output Example:** "Congrats! You guessed correctly, the number was 5! It took you 3 guess(es)!"<br/>
<br/><br/>
### Feature 4: History in the making. (Show previous guesses.)
Let’s update the last feature so that instead of just the number of guesses, we let the user know all of their previous guesses before they got the right answer.
<br/><br/>
...<br/>
**Input Example:** 7<br/>
**Output Example:** "Congrats! You guessed correctly, the number was 7! Previous guess(es): 5,2,9"<br/>
<br/><br/>
### Feature 5: Guess who? (Include user's name.)
Let’s add a feature that takes in the user’s name so we can make the messages more personalized. You can either pass this as an argument (`args`) or collect it using `Prompt.present()`.
<br/><br/>
...<br/>
**Input Example:** 3<br/>
**Input Example:** Elon<br/>
**Output Example:** "Sorry, Elon! You guessed incorrectly. Try guessing a higher number. Previous guess(es): 2"<br/>
<br/><br/>
### Feature 6: Play it again! (Determine if we should keep running application.)
Let’s add a feature that asks the user if they want to play again once they’ve made a correct guess. "y" or "yes" will start gameplay again and inversely so with the opposite inputs.
<br/><br/>
**Input Example:** 7<br/>
**Input Example:** Miranda<br/>
**Output Example:** "Congrats, Miranda! You guessed correctly, the number was 7! Previous guess(es): 5,2,9"<br/>
**Output Example:** "Do you want to play again? (y/n)"<br/>
**Input Example:** y<br/>
...<br/>
<br/><br/>
### Feature 7: Guess star. (Leaderboard for subsequent players.)
Let’s add a feature that records the number of guesses for each unique guest name that is entered when the game is started. If someone with the same name played before, then when they get a correct answer, it tells them if they beat their previous attempt (less guesses is better). 
<br/><br/>
...<br/>
**Input Example:** 4<br/>
**Input Example:** Bob<br/>
**Output Example:** "Congrats, Bob! You guessed correctly, the number was 4! Previous guess(es): 2,5,6. You didn't beat your previous guess attempt."<br/>
**Output Example:** "Do you want to play again? (y/n)"<br/>
**Input Example:** n<br/>
...<br/>
**Input Example:** 3<br/>
**Input Example:** Miranda<br/>
**Output Example:** "Sorry, Miranda! You guessed incorrectly, try guessing a higher number!"<br/>
**Input Example:** 7<br/>
**Output Example:** "Congrats, Miranda! You guessed correctly, the number was 7! Previous guess(es): 3. You guessed fewer times than Bob did!"<br/>
**Output Example:** "Do you want to play again? (y/n)"<br/>
**Input Example:** n<br/>
<br/><br/>
### Have Extra Time? Feel free to add an extra feature in your game!
You might want to add a number that limits the times the user can guess. Or perhaps you want to add more messages based off of how the user is guessing? It's your project so feel free to tinker with it further, time permitting!
