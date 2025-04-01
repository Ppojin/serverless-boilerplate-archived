build-testLambda:
	./gradlew :application:oauth2:wrapAwsLambdaPackage
	unzip ./application/oauth2/build/libs/oauth2-aws.jar -d $(ARTIFACTS_DIR)
