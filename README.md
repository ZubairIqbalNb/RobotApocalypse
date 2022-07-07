# Robot Apocalypse Monitor (RAM)

World as we know is taken over by robots.
The robots once friendly, have now turned against mankind,
infecting everyone with a robot engineered virus called REV-50.

RAM is designed to store/provide information about the robots, survivors, 
their resourses, infected survivors and their percentage.
RAM provides excellent service to tackle the sneaky robotic attacks and to limit the spread of REV-50.

## Author

- Zubair Iqbal - Software Engineer

## 🛠 Skills Used

Spring Boot, Spring REST, REST Template, Maven, JPA, H2 Database.

## API Reference

### Add survivor

`Method: POST`

 `API Endpoint: /survivor`
  
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | Id of survivor |
| `name`      | `String` | name of survivor |
| `age`      | `String` | age of survivor |
| `gender`      | `String` | gender of survivor |
| `lastLocation`      | `String` | lastLocation of survivor |
| `water`      | `Boolean` | resource of survivor |
| `food`      | `Boolean` | resource of survivor |
| `medication`      | `Boolean` | resource of survivor |
| `ammunition`      | `Boolean` | resource of survivor |
| `contaminationCount`      | `int` | contaminationCount of survivor |
| `isInfected`      | `Boolean` | isInfected survivor |

### Update location of survivor

`Method: PUT`

`API Endpoint:/survivor/update-location?survivor_id&last_location`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `survivor_id`      | `long` | Id of survivor |
| `last_location`      | `String` | lastLocation of survivor |

### Report contamination of survivor

  `Method: PUT`
  
  `API Endpoint: /report/survivor?survivor_id`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `survivor_id`      | `long` | Id of survivor |

### Get infected survivors list and percentage

`Method: GET`

`API Endpoint: /survivor/infected-list-and-percentage`

### Get non-infected survivors list and percentage

`Method: GET`

`API EndPoint: /survivor/non-infected-list-and-percentage`
