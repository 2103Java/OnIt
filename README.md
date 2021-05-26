# OnIt

## Project Description

With OnIt, a user can create a highly customizable, visually pleasing to-do list. They can view a graph showing how many they've completed over the past <number specified by user> days, as well as download their task list to a file! All of these features are accessible after registering for an account and signing in.

## Technologies Used
* Angular
* HTML
* CSS
* Typescript
* Angular Material
* Bootstrap
* Java
* Spring (Core, MVC).
* Hibernate.
* PostgreSQL.
* Apache Tomcat.
* JUnit.
* Mockito.
* Log4j.
  
## Features
With OnIt, a user can:

* Register for an account.
* Sign in to a user home page displaying a filterable (by category, by whether it has been completed) grid list of their tasks.
* Create and edit a task with a name, description, due date, category label, (optional) location via Google Maps and can (optionally) be marked as repeatable. 
  Each task also has an option to send an email reminder to the user one day before its due date.
* View their "Task Stats", where a curve graph shows them how many tasks they've completed over the past n days, where they specify n via a dropdown box.
* Download their task list to a file.
* Update their account information, or delete their account.

To-do's:
* Allow users to specify their own category label for a task instead of (only) offering a set list of choices,
* Show additional data related to user productivity on the "Task Stats" page.
* Send email to a user when they register.

## Getting Started

OnIt can be accessed through the following link:
  
     http://onitp2.s3-website.us-east-2.amazonaws.com


## Usage

Upon entering in the URL above,
you will be welcomed with the sign-in page:

![image](https://user-images.githubusercontent.com/47725693/119022006-b980e600-b965-11eb-9baf-b78bd0ed39a0.png)

Click 'Sign up here!' to be taken to the Registration page:

![image](https://user-images.githubusercontent.com/47725693/119022070-cd2c4c80-b965-11eb-9a3b-dac14cb6f745.png)


Enter a desired username, password, and use one the following invitation codes:
* 10 to register as 'employee'
* 12 to register as 'financial manager'

Click 'Sign Up' to complete registration.

Back on the Home page, login with your username and password.

Upon logging in (with a newly created 'financial manager' account), this will be your user home page:

![image](https://user-images.githubusercontent.com/47725693/119022490-53e12980-b966-11eb-9c5b-7b96428cc169.png)

Now, click the user icon in the upper-left corner of the page, and you will see the following (as a financial manager):

![image](https://user-images.githubusercontent.com/47725693/119022810-a15d9680-b966-11eb-8dda-c72de150b109.png)

The only difference as an 'employee' is that the 'Approve/Deny Tickets (FINANCE MANAGER MODE)' option does not appear:

![image](https://user-images.githubusercontent.com/47725693/119023603-bedf3000-b967-11eb-9f72-aaa11ca402c6.png)

     
     
To submit an expense reimbursement request, click 'Submit Ticket', and the following will appear:

![image](https://user-images.githubusercontent.com/47725693/119023060-f39eb780-b966-11eb-9456-eabca7c73d5b.png)

Enter in the following: 
* A reimbursement request type (Lodging, Travel, Food, or Other).
* An amount to be reimbursed.
* A description.

Then click Submit Ticket, and your table will be updated:

![image](https://user-images.githubusercontent.com/47725693/119023299-47a99c00-b967-11eb-9c9d-077dcc7d5922.png)

As as admin, you can approve/deny ticket requests.
To do so, go back to the user icon in the upper left corner and click 'Approve/Deny Tickets (FINANCE MANAGER MODE)'.
You will be taken to the following:

![image](https://user-images.githubusercontent.com/47725693/119024464-b3403900-b968-11eb-8d25-c6f126638b39.png)

To approve or deny a request, click the appropriate button.




## Contributors
Benjamin Markos, Hassah Shallal, James Suspenders McGee, Kent Berry, Jacob Erdman
   
