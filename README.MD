

This project is an API developed using Java, Java Spring, and AWS Simple Email Service (SES). 
## Table of Contents
1. [Installation](#installation)
2. [Configuration](#configuration)
3. [Usage](#usage)
4. [API Endpoints](#api-endpoints)
5. [Database](#database)
6. [Contributing](#contributing)

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Igorpereirag/Email_Service.git
   ```
2. Install dependencies with Maven.

3. Update `application.properties` with your AWS Credentials:
   ```properties
    aws.region=us-east-1
    aws.accessKeyId=SUA_CHAVE
    aws.secretKey=SUA-SECRET
   ```

## Configuration
- Make sure to update the `application.properties` file with your AWS credentials.

## Usage
1. Start the application with Maven.

2. The API will be accessible at [http://localhost:8080](http://localhost:8080).

## API Endpoints
The API provides the following endpoints:

### GET EMAIL

- **POST /api/email/send:** Send an email from your sender to the destination.

  **BODY:**
  ```json
  {
    "to": "EMAIL",
    "subject": "test",
    "body": "test"
  }
  ```

## Database
- No database is required for this API.

## Contributing
Contributions are welcome! If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing, follow the existing code style, commit conventions, and submit your changes in a separate branch.