![Logo](https://github.com/nayciyilmaz/LoginApp/blob/main/proje1.png?raw=true)
![Logo](https://github.com/nayciyilmaz/LoginApp/blob/main/proje2.png?raw=true)

## Features

Smooth Navigation: Implements a multi-screen navigation system using NavHost to handle transitions between login, sign-up, homepage, and other screens.
Responsive UI: Utilizes Jetpack Compose for creating a dynamic and visually appealing user interface.
Custom Validation: Includes validation for user inputs such as name, email, and password during the sign-up process.
Back Handling: Ensures proper back navigation behavior using BackHandler for enhanced user experience.
Alert Dialog: Displays an alert dialog on logout for user confirmation.
Gradients and Styling: Features a modern look with gradient backgrounds and styled text elements.

## Project Structure

Navigation
LoginNavigation.kt: Central navigation component using NavHost to define routes for different app screens.
Screens
StartScreen.kt: Displays a splash screen with a gradient background and navigates to the main screen after a delay.
SignUpScreen.kt: Contains the sign-up form with input fields for name, email, and password, including validation logic.
SignInScreen.kt: Allows users to sign in with pre-validated credentials.
HomepageScreen.kt: Displays the homepage with a logout button that triggers a confirmation alert dialog.
MainScreen.kt: Provides options for users to navigate between sign-in and sign-up screens.
ViewModel
LoginViewModel.kt: Handles the business logic for validating user inputs and managing app state during sign-up and login processes.

## Technologies Used

Kotlin: Programming language used for the entire project.
Jetpack Compose: Android's modern toolkit for building native UIs.
Material Design 3: Ensures a visually consistent and accessible design.
Navigation Component: Simplifies navigation between app screens.
AlertDialog API: Used to show confirmation messages (e.g., logout confirmation).
BackHandler API: Handles back press events efficiently.
