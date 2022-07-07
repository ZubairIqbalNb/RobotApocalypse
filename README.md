# Robot Apocalypse Monitor (RAM)

World as we know is taken over by robots.
The robots once friendly, have now turned against mankind,
infecting everyone with an engineered zombie-virus called (D-ZV).

RAM is designed to store/keep information about the survivors, their resourses, infected survivors and their percentage, in order to track and limit the spread of D-ZV.

## Author

- Zubair Iqbal - Backend Developer

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
| `water`      | `Boolean` | resourse of survivor |
| `food`      | `Boolean` | resourse of survivor |
| `medication`      | `Boolean` | resourse of survivor |
| `ammunition`      | `Boolean` | resourse of survivor |
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
  
  'API Endpoint: /report/survivor`

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | Id of survivor |

### Get infected survivors list and percentage

`Method: GET`

`API Endpoint: /survivor/infected-list-and-percentage`

### Get non-infected survivors list and percentage

`Method: GET`

`API EndPoint: /survivor/non-infected-list-and-percentage`
