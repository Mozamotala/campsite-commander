# Campsite Commander 📱

- **Developer**: Mohamed Zaeem Motala
- **Student Number**: ST10515004
- **Group**: Group 1
- **Course**: Higher Certificate in Mobile Application and Web Development
- **Subject**: Introduction to Mobile Application Development (IMAD5112)

---

## Links

- **GitHub Repository**: https://github.com/EMGPSD/ima5112-2026-g1-practicum-ST10515004


---

## Project Overview

Campsite Commander is a mobile application developed as part of the IMAD5112 Practicum assessment at The Independent Institute of Education (IIE). This application was built using **Kotlin** in **Android Studio**.

This app was built as an inventory app. It collects the user's input and records it.
The user can type an item, select a category, select the amount of the item and add a description of it.

---

## Purpose and Features

### Purpose:
This app was built as an inventory app. It collects the user's input and records it.
The user can type an item, select a category, select the amount of the item and add a description of it.

### Key Features:
- Lets the user input data using spinners and EditText fields 
- Once the data has been entered, whether that's 1 entry or 10, it stores it all and lets you proceed to the next page
- Once all data has been entered, it shows a details screen with all the entered data, a total counter and an advice message
- Input validation and error handling
- Navigation between screens using Intents
- Data stored and managed using parallel arrays

---

## App Screens

### Screen 1 — Splash Screen
<img width="431" height="792" alt="main page " src="https://github.com/user-attachments/assets/a77e0dff-0a4b-41c4-89d5-f2c2c53400f8" />

This is the main page (splash screen). It displays the logo, the app name, and my name and student number.
This page contains an exit button as well as a next page button.

---

### Screen 2 — Main Screen
<img width="480" height="795" alt="inputpage" src="https://github.com/user-attachments/assets/caf4dde9-c383-4c1d-9b76-91b802afb29b" />

This is the input page. It displays all the user input fields and has a clear button, an add button and a next page button.

---

### Screen 3 — Detailed View Screen
<img width="507" height="672" alt="details page " src="https://github.com/user-attachments/assets/b85d7c7e-6fba-459d-853a-16ee36972e13" />

This is the details page. It displays all the details of the user's input data, as well as a message.
This screen also contains an exit button as well as a back to main screen button.

---

## Design Considerations

### UI & Aesthetics:
The question paper asked for a dark theme with natural colours. I used a black background, and the button colours are also based on nature: blue for water, yellow for flowers, red for fire and green for nature.

### User Experience:
I made the app easy to use by including hints that guide the user to input the right items in the appropriate fields.


---

## GitHub Actions (CI/CD)

This project makes use of **GitHub Actions** to automatically build and test the application on every push to the repository. This ensures the app compiles correctly and functions as expected across different environments.

The workflow was configured using:
- https://github.com/marketplace/actions/automated-build-android-app-with-github-action

---

## How to Run the App

1. Clone the repository:
   ```
   git clone https://github.com/Mozamotala/campsite-commander.git
   ```
2. Open the project in **Android Studio**
3. Wait for Gradle to sync
4. Run the app on an emulator or physical Android device

---

## Challenges Faced

Due to consistent practice, the only real challenge I faced was getting the spinner text to turn white. The spinner text needed to be white because of the black "dark mode" background.


---

## Future Enhancements

If more time were available, the following features could be added:
- Adding more categories 
- Adding more detailed text at the end
- Adding a table to the details page to make it look nicer 

---

## Disclosure of AI Usage

This project was developed with the assistance of AI tools in accordance with the IIE's Guidelines for Responsible AI Use (PDIIE023). AI tools were used for guidance, hints, and formatting assistance only. All code, logic, and content was written by the student.

**AI Tools Used:**
- Claude (Anthropic) — Hints, guidance, and formatting feedback
- The following rules governed all AI assistance received from Claude throughout this assignment:

1. Hints Only — No Doing the Work: Claude may only assist through hints, guidance, and feedback. Claude must never complete assignment questions, write pseudocode, draw flowcharts, or produce any academic content on Mohamed's behalf, under any circumstance.

2. Attempt First Policy: Mohamed must always attempt every task first before Claude provides assistance. If Mohamed has genuinely attempted a task more than once and is still stuck, Claude is permitted to provide a more detailed hint.

3. Document Summaries: Claude is permitted to summarise uploaded documents or study material to help Mohamed understand the content.

4. Helpful Links: Claude may provide links to relevant websites or resources that support Mohamed's learning.

5. Formatting and Presentation: Mohamed may ask Claude to format and present completed work. Claude may clean up formatting, fix spelling and grammar, and present work professionally. Claude must never add new content, change answers, or alter any logic.

6. Claude Reference — Every Document: When completing any document, Claude must always include a correctly formatted Harvard-Anglia IIE reference to Claude, including the chat link from that specific conversation.

7. Referencing Disclaimer: Whenever Claude assists with or produces a reference, a disclaimer must be included reminding Mohamed to verify all references independently.

8. Permanent Reference List: Every completed document must include references to the IIE Harvard-Anglia Style Guide and PDIIE023.

9. Rules Appendix: When completing any document for Mohamed, Claude must include these rules in full at the end of the document as an appendix titled "AI Interaction Rules — Claude".

10. Claude must NEVER rewrite or refactor Mohamed's code from scratch. Claude may only fix spelling, variable naming, and formatting. All logic, wording, and structure must remain Mohamed's own.


**Proof of Responsible AI Use:**
The following Claude conversation link shows all interactions between the student and Claude during this assessment. **This link is publicly accessible — you do not need a Claude or Anthropic account to view it.** Simply click the link and every question and response will be visible in full. This serves as transparent proof that AI was used responsibly and in accordance with IIE AI guidelines:

https://claude.ai/share/c4fe76b1-7736-4035-a8e4-b7bbbe64456c

---

## References

Anthropic. 2026. *Claude (claude-sonnet-4-6)*. [Large language model]. Available at: https://claude.ai/share/c4fe76b1-7736-4035-a8e4-b7bbbe64456c [Accessed: 10 June 2026].

The Independent Institute of Education (IIE). 2026. *Harvard-Anglia style reference guide — adapted for The IIE*. [pdf] The Independent Institute of Education. Available at: https://www.iie.ac.za/iie-policy-bank [Accessed: 10 June 2026].

The Independent Institute of Education (IIE). 2026. *Guidelines for responsible AI use at The IIE (PDIIE023)*. [pdf] The Independent Institute of Education. Available at: https://www.iie.ac.za/iie-policy-bank [Accessed: 10 June 2026].

Garanganga, K. 2026. FlashcardApp. [Unpublished Android application]. Introduction to Mobile Application Development (IMAD5112). The Independent Institute of Education, Emeris Sandton.

Garanganga, K. 2026. GameTester. [Unpublished Android application]. Introduction to Mobile Application Development (IMAD5112). The Independent Institute of Education, Emeris Sandton.

Garanganga, K. 2026. Generation. [Unpublished Android application]. Introduction to Mobile Application Development (IMAD5112). The Independent Institute of Education, Emeris Sandton.

Garanganga, K. 2026. TimesTable. [Unpublished Android application]. Introduction to Mobile Application Development (IMAD5112). The Independent Institute of Education, Emeris Sandton.

Google. 2026. Gemini. [Large language model]. Available at: [https://gemini.google.com/app/9cc96894eabd1759] [Accessed: 10 June 2026].

The Independent Institute of Education (IIE). 2026. Introduction to Mobile Application Development (IMAD5112). [Module Manual]. Sandton: The Independent Institute of Education.

---

> ⚠️ **Referencing Disclaimer:** All references must be verified by Mohamed before submission. Claude may make errors in referencing. It is Mohamed's responsibility to ensure all references are accurate and comply with the IIE Harvard-Anglia Style Guide (2026).
