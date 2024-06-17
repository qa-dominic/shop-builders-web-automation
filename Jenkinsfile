pipeline {
    agent {
        label 'Dominic-PC-D'
    }
    environment {
        MAVEN_CMD = "mvn clean compile"
        REPORT_DIR = "Reports"
        REPORT_FILE = "Spark.html"
        REPORT_NAME = "ExtentReport"
    }

    stages {
        stage('Build') {
            steps {
                bat "${MAVEN_CMD}"
            }
            post {
                failure {
                    echo "Build failed. Please check the logs."
                }
            }
        }

        stage('loginRegister Test') {
            steps {
                bat "mvn test -DfileName=loginRegister.xml"
            }
            post {
                success {
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: false,
                        reportDir: "${REPORT_DIR}",
                        reportFiles: "${REPORT_FILE}",
                        reportName: "${REPORT_NAME}",
                        reportTitles: '',
                        useWrapperFileDirectly: true
                    ])
                }
                failure {
                    echo "loginRegister test failed. Please check the logs."
                }
            }
        }

        stage('Merchant Test') {
            steps {
                bat "mvn test -DfileName=merchant.xml"
            }
            post {
                success {
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: false,
                        reportDir: "${REPORT_DIR}",
                        reportFiles: "${REPORT_FILE}",
                        reportName: "${REPORT_NAME}",
                        reportTitles: '',
                        useWrapperFileDirectly: true
                    ])
                }
                failure {
                    echo "Merchant test failed. Please check the logs."
                }
            }
        }

        stage('Support Admin Test') {
            steps {
                bat "mvn test -DfileName=supportadmin.xml"
            }
            post {
                success {
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: false,
                        reportDir: "${REPORT_DIR}",
                        reportFiles: "${REPORT_FILE}",
                        reportName: "${REPORT_NAME}",
                        reportTitles: '',
                        useWrapperFileDirectly: true
                    ])
                }
                failure {
                    echo "Support Admin test failed. Please check the logs."
                }
            }
        }

        stage('Admin Test') {
            steps {
                bat "mvn test -DfileName=admin.xml"
            }
            post {
                success {
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: false,
                        reportDir: "${REPORT_DIR}",
                        reportFiles: "${REPORT_FILE}",
                        reportName: "${REPORT_NAME}",
                        reportTitles: '',
                        useWrapperFileDirectly: true
                    ])
                }
                failure {
                    echo "Admin test failed. Please check the logs."
                }
            }
        }
    }
}