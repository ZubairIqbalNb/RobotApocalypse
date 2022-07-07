# Robot Apocalypse Monitor (RAM)

World as we know is taken over by robots.
The robots once friendly, have now turned against mankind,
infecting everyone with an engineered virus called D-ZV.

RAM is designed to store/provide information about the robots, survivors, 
their resourses, infected survivors and their percentage.
RAM provides excellent service to tackle the sneaky robotic attacks and to limit the spread of D-ZV.

## Author

- Zubair Iqbal - Software Engineer

## 🛠 Skills Used

Spring Boot, Spring REST, REST Template.

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
| `longitude`      | `String` | location of survivor |
| `latitude`      | `String` | location of survivor |
| `water`      | `Boolean` | resource of survivor |
| `food`      | `Boolean` | resource of survivor |
| `medication`      | `Boolean` | resource of survivor |
| `ammunition`      | `Boolean` | resource of survivor |
| `infectionCount`      | `int` | infectionCount of survivor |
| `isInfected`      | `Boolean` | isInfected of survivor |

### Update location of survivor

`Method: PUT`

`API Endpoint:/survivor/update-location?survivor_id&latitude&longitude`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | Id of survivor |
| `latitude`      | `String` | latitude of survivor |
| `longitude`      | `String` | longitude of survivor |

### Report contamination of survivor

  `Method: PUT`
  
  `API Endpoint: /report/survivor`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | Id of survivor |

### Get infected survivors list and percentage

`Method: GET`

`API Endpoint: /survivor/infected-list-and-percentage`

### Get non-infected survivors list and percentage

`Method: GET`

`API EndPoint: /survivor/non-infected-list-and-percentage`
