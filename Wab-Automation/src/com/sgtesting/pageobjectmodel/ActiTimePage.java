package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	
	}
	//Users 
		@FindBy(xpath ="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement oUsers;
		public WebElement getUsers()
		{
			return oUsers;
		}
		//For Adding User
		@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
		private WebElement oAddUser;
		public WebElement getAddusers()
		{
		    return oAddUser;	
		}
		//For First name
		private WebElement firstName;
		public WebElement getFirstname()
		{
			return firstName;
		}
		
				//For Last Name
		private WebElement lastName;
		public WebElement getLastname()
		{
			return lastName;
		}
		//For Mail id
		private WebElement email;
		public WebElement getEmail()
		{
			return email;
		}
		//For User name
		private WebElement userDataLightBox_usernameField;
		public WebElement getUsername()
		{
			return userDataLightBox_usernameField;
		}
		//for Password
		private WebElement password;
		public WebElement getpassword()
		{
			return password;
		}
		//for RtPassword
		private WebElement passwordCopy;
		public WebElement getRtpassword()
		{
			return passwordCopy;
		}
		//for CreateUser
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement CreateUser;
		public WebElement getCreateUser()
		{
			return CreateUser;
		}
		//for deleteUser
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
		private WebElement deleteUser;
		public WebElement getdeleteUser()
		{
			return deleteUser;
		}
		//for DeleteUser
		@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		private WebElement DeleteUser;
		public WebElement getDeleteUser()
		{
			return DeleteUser;
		}
		
		//modify
				@FindBy(xpath ="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
				private WebElement ouserNameContainer;
				public WebElement getuserNameContainer()
				{
					return ouserNameContainer;
				}
				
				//For First name
				private WebElement userDataLightBox_firstNameField;
				public WebElement getfirstname()
				{
					return userDataLightBox_firstNameField;
	
				}
				// task
				@FindBy(xpath ="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
				private WebElement oTasks;
				public WebElement getTasks()
				{
					return oTasks;
				}
				// add new
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
				private WebElement Addnew;
				public WebElement getAddnew()
				{
					return Addnew;
				}	
				// creat customer
				@FindBy(xpath ="/html/body/div[14]/div[1]")
				private WebElement createNewCustomer;
				public WebElement getcreateNewCustomer()
				{
					return createNewCustomer;
				}	
				// name of customer
				@FindBy(xpath ="//*[@id=\"customerLightBox_nameField\"]")
				private WebElement customerLightBox_nameField;
				public WebElement getcustomerLightBox_nameField()
				{
					return customerLightBox_nameField;
				}	
				// create customer
				@FindBy(xpath ="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
				private WebElement CreateCustomer;
				public WebElement getCreateCustomer()
				{
					return CreateCustomer;
				}
				//delete customer
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement DeleteCustomer;
				public WebElement getDeleteCustomer()
				{
					return DeleteCustomer;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
				private WebElement Action;
				public WebElement getAction()
				{
					return Action;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
				private WebElement Delete;
				public WebElement getDelete()
				{
					return Delete;
				}
				
				@FindBy(xpath ="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
				private WebElement Deletepermanently;
				public WebElement getDeletepermanently()
				{
					return Deletepermanently;
				}
				// modifiycustomer
				
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement Customersettings;
				public WebElement getCustomersettings()
				{
					return Customersettings;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
				private WebElement taskListBlock;
				public WebElement gettaskListBlock()
				{
					return taskListBlock;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
				private WebElement EnterCustomerreName;
				public WebElement getEnterCustomerreName()
				{
					return EnterCustomerreName;
				}
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
				private WebElement closeButton;
				public WebElement getcloseButton()
				{
					return closeButton;
				}
				// create project
				
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
				private WebElement Addnewp;
				public WebElement getAddnewp()
				{
					return Addnewp;
				}
				
				@FindBy(xpath ="/html/body/div[14]/div[2]")
				private WebElement Addproject;
				public WebElement getAddproject()
				{
					return Addproject;
				}
				
				@FindBy(xpath ="//*[@id=\"projectPopup_projectNameField\"]")
				private WebElement EnteProjectName;
				public WebElement getEnteProjectName()
				{
					return EnteProjectName;
				}
				
				@FindBy(xpath ="//*[@id=\"projectPopup_commitBtn\"]/div/span")
				private WebElement CreateProject;
				public WebElement getCreateProject()
				{
					return CreateProject;
				}
				
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement editButton;
				public WebElement geteditButton()
				{
					return editButton;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement action;
				public WebElement getaction()
				{
					return action;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
				private WebElement Deleteproject;
				public WebElement getDeleteproject()
				{
					return Deleteproject;
				}
				
				@FindBy(xpath ="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
				private WebElement Deletepermanentlyproject;
				public WebElement getDeletepermanentlyproject()
				{
					return Deletepermanentlyproject;
				}
				// modidify project
				@FindBy(xpath ="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement editButtonproject;
				public WebElement geteditButtonproject()
				{
					return editButtonproject;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
				private WebElement nameLabel;
				public WebElement getnameLabel()
				{
					return nameLabel;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
				private WebElement EnterProjectreName;
				public WebElement getEnterProjectreName()
				{
					return EnterProjectreName;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
				private WebElement closeButtonp;
				public WebElement getcloseButtonp()
				{
					return closeButtonp;
				}
				// new task
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
				private WebElement AddNewTask;
				public WebElement getAddNewTask()
				{
					return AddNewTask;
				}
				
				@FindBy(xpath ="/html/body/div[13]/div[1]")
				private WebElement Createnewtasks;
				public WebElement getCreatenewtasks()
				{
					return Createnewtasks;
				}
				
				@FindBy(xpath ="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
				private WebElement Entertaskname;
				public WebElement getEntertaskname()
				{
					return Entertaskname;
				}
				
				@FindBy(xpath ="//*[@id=\"createTasksPopup_commitBtn\"]")
				private WebElement CreateTasksbutton;
				public WebElement getCreateTasksbutton()
				{
					return CreateTasksbutton;
				}
			// delete task	
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
				private WebElement taskRowCellWrapper;
				public WebElement gettaskRowCellWrapper()
				{
					return taskRowCellWrapper;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement taskaction;
				public WebElement gettaskaction()
				{
					return taskaction;
				}
				
				@FindBy(xpath ="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
				private WebElement taskDelete;
				public WebElement gettaskDelete()
				{
					return taskDelete;
				}
				
				@FindBy(xpath ="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
				private WebElement taskDeletepermanently;
				public WebElement gettaskDeletepermanently()
				{
					return taskDeletepermanently;
				}
				
				//For Adding User advance ass1 adding user2
				@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
				private WebElement oAddUser1;
				public WebElement getAddusers1()
				{
				    return oAddUser1;	
				}
				//For firsname
				@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
				private WebElement firstName2;
				public WebElement getfirstName2()
				{
				    return firstName2;	
				}
				
						//For Last Name
				@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
				private WebElement lastName2;
				public WebElement getlastName2()
				{
				    return lastName2;	
				}
				//For Mail id
				@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
				private WebElement emailField2;
				public WebElement getemailField2()
				{
				    return emailField2;	
				}
				//For User name
				@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
				private WebElement Username2;
				public WebElement getUsername2()
				{
				    return Username2;	
				}
				//for Password
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
				private WebElement Password2;
				public WebElement getPassword2()
				{
				    return Password2;	
				}
				//for RtPassword
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
				private WebElement RetypePassword2;
				public WebElement getRetypePassword2()
				{
				    return RetypePassword2;	
				}
				//for CreateUser
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement CreateUser2;
				public WebElement getCreateUser2()
				{
					return CreateUser2;
				}
				
				//For Adding User advance ass1 adding user3
				@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
				private WebElement oAddUser3;
				public WebElement getAddusers3()
				{
				    return oAddUser3;	
				}
				//For firsname
				@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
				private WebElement firstName3;
				public WebElement getfirstName3()
				{
				    return firstName3;	
				}
				
						//For Last Name
				@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
				private WebElement lastName3;
				public WebElement getlastName3()
				{
				    return lastName3;	
				}
				//For Mail id
				@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
				private WebElement emailField3;
				public WebElement getemailField3()
				{
				    return emailField3;	
				}
				//For User name
				@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
				private WebElement Username3;
				public WebElement getUsername3()
				{
				    return Username3;	
				}
				//for Password
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
				private WebElement Password3;
				public WebElement getPassword3()
				{
				    return Password2;	
				}
				//for RtPassword
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
				private WebElement RetypePassword3;
				public WebElement getRetypePassword3()
				{
				    return RetypePassword3;	
				}
				//for CreateUser
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement CreateUser3;
				public WebElement getCreateUser3()
				{
					return CreateUser3;
				}
				
				//Logout
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oLogout1;
				public WebElement getLogout1()
				{
					return oLogout1;
					
				}
				
				//User login user 1
				@FindBy(xpath="//*[@id=\"username\"]")
				private WebElement ousername1;
				public WebElement getusername1()
				{
					return ousername1;
					
				}

				//Password WebElement
				@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
				private WebElement password1;
				public WebElement getpassword1()
				{
					return password1;
					
				}
				
				//Login button WebElement
				@FindBy(xpath="//*[@id=\"loginButton\"]/div")
				private WebElement Login1;
				public WebElement getLogin1()
				{
					return Login1;
				}
				
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
				private WebElement Startexploring1;
				public WebElement getStartexploring1()
				{
					return Startexploring1;
				}
				
				//Logout
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oLogout2;
				public WebElement getLogout2()
				{
					return oLogout2;
					
				}
				
				//User login user 2
				@FindBy(xpath="//*[@id=\"username\"]")
				private WebElement ousername2;
				public WebElement getusername2()
				{
					return ousername2;
					
				}

				//Password WebElement
				@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
				private WebElement password2;
				public WebElement getpassword2()
				{
					return password2;
					
				}
				
				//Login button WebElement
				@FindBy(xpath="//*[@id=\"loginButton\"]/div")
				private WebElement Login2;
				public WebElement getLogin2()
				{
					return Login2;
				}
				
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
				private WebElement Startexploring2;
				public WebElement getStartexploring2()
				{
					return Startexploring2;
				}
				
				//Logout
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oLogout3;
				public WebElement getLogout3()
				{
					return oLogout3;
					
				}
				
				//User login user 3
				@FindBy(xpath="//*[@id=\"username\"]")
				private WebElement ousername3;
				public WebElement getusername3()
				{
					return ousername3;
					
				}

				//Password WebElement
				@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
				private WebElement password3;
				public WebElement getpassword3()
				{
					return password3;
					
				}
				
				//Login button WebElement
				@FindBy(xpath="//*[@id=\"loginButton\"]/div")
				private WebElement Login3;
				public WebElement getLogin3()
				{
					return Login3;
				}
				
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
				private WebElement Startexploring3;
				public WebElement getStartexploring3()
				{
					return Startexploring3;
				}
				
				//Logout
				@FindBy(xpath="//*[@id=\"logoutLink\"]")
				private WebElement oLogout4;
				public WebElement getLogout4()
				{
					return oLogout3;
					
				}
				
				// login as admin for modidify
				
				@FindBy(xpath="//*[@id=\"username\"]")
				private WebElement olonginadmin;
				public WebElement getolonginadmin()
				{
					return olonginadmin;
					
				}

				//Password WebElement
				@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
				private WebElement adminpassword;
				public WebElement getadminpassword()
				{
					return adminpassword;
					
				}
				
				//Login button WebElement
				@FindBy(xpath="//*[@id=\"loginButton\"]/div")
				private WebElement adminLogin;
				public WebElement getadminLogin()
				{
					return adminLogin;
				}
			// modify user1
				
				@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
				private WebElement ouser1;
				public WebElement getouser1()
				{
					return ouser1;
				}
				
				
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")
				private WebElement userNameCellfirst1;
				public WebElement getuserNameCellfirst1()
				{
					return userNameCellfirst1;
				}
				
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
				private WebElement NewPassworduser1;
				public WebElement getNewPassworduser1()
				{
					return NewPassworduser1;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
				private WebElement passwordCopyuser1;
				public WebElement getpasswordCopyuser1()
				{
					return passwordCopyuser1;
				}
				
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement SaveChangesuser1;
				public WebElement getSaveChangesuser1()
				{
					return SaveChangesuser1;
				}
				
// modify user2
				@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
				private WebElement ouser2;
				public WebElement getouser2()
				{
					return ouser2;
				} 
				                
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
				private WebElement userNameCellfirst2;
				public WebElement getuserNameCellfirst2()
				{
					return userNameCellfirst2;
				}
				
				@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[3]/div[3]/input")
				private WebElement NewPassworduser2;
				public WebElement getNewPassworduser2()
				{
					return NewPassworduser2;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
				private WebElement passwordCopyuser2;
				public WebElement getpasswordCopyuser2()
				{
					return passwordCopyuser2;
				}
				
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement SaveChangesuser2;
				public WebElement getSaveChangesuser2()
				{
					return SaveChangesuser2;
				}
				
				// modify user3
				@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
				private WebElement ouser3;
				public WebElement getouser3()
				{
					return ouser2;
				} 
				                
				@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[6]/td[1]")
				private WebElement userNameCellfirst3;
				public WebElement getuserNameCellfirst3()
				{
					return userNameCellfirst2;
				}
				
				@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[3]/div[3]/input")
				private WebElement NewPassworduser3;
				public WebElement getNewPassworduser3()
				{
					return NewPassworduser2;
				}
				@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
				private WebElement passwordCopyuser3;
				public WebElement getpasswordCopyuser3()
				{
					return passwordCopyuser2;
				}
				
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement SaveChangesuser3;
				public WebElement getSaveChangesuser3()
				{
					return SaveChangesuser3;
				}

				
				
				
				
				
//Logout link
@FindBy(linkText="Logout")
private WebElement oLogout;
public WebElement getLogout()
{
	return oLogout;
	
}
}	
	
	