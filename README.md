# FOOTBALL INQUIRY MICROSERVICE API
## football-inquiry
Microservices - to fetch football league team standings from football inquiry api


Develop, Test and Deploy a microservice to find standings of a team playing league football match using country name, league name and team name. The
service should be accessible via web browser on internet and end user should be able to view results by changing previously listed parameters. Output of
this service should be presented in web browser using any one of Javascript framework, HTML or JSON. And the service should be ready to be released
to production or live environment. In output, display following:   

`Country ID & Name: (<ID>) - <name>  ` 
`League ID & Name: (<ID>) - <name> ` 
`Team ID & Name: (<ID>) - <name>  `
`Overall League Position: <position>  `

HTTP URL: `http://localhost:8081/api/service/v1/team/standing?teamName=Norwich&countryName=England&leagueName=Championship`

OUTPUT:
	`{"country":"(41) - England","league":"(149) - Championship","team":"(2641) - Norwich","overallPosition":1}`


# EXTERNAL SYSTEM SPECIFICATION
	API Documentation : https://apifootball.com/documentation/
	API Url : https://apiv2.apifootball.com/

# TODO
	Unit Test Cases
	Integration Test Cases
	Web Application Test Cases
	Jenkins CI/CD

# BUILD
	Import as existing maven project
	Update maven dependencies 
	mvn clean install 
	Check \build.log for more details.
	
# AUTHOR
	Name : DINESH KUMAR LOHIA
	GIT  : https://github.com/lohiadinesh/
	Linked In: https://www.linkedin.com/in/dineshkumarlohia/ 
