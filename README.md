The following is a small test program that demonstrates a strange issue with Junit, Easymock, Commons Logging,
and EclEmma/Jacoco.  EclEmma is a (usually awesome) coverage tool that runs under eclipse and maven via jacoco plugin. 

See:
	https://stackoverflow.com/questions/65511268/getting-a-no-coverage-data-has-been-collected-using-emma-and-eclipse

When I run junit tests with EclEmma coverage I get the following error:

	No coverage data has been collected during this coverage Session.
	Please do not terminate the Java process manually from Eclipse.

If you do any of the following the problem goes away:

* Comment out the commons-logging `Log` reference from `Bar`.
* Remove the junit `@Test` timeout field.
* Comment out the `createMock(...)` line from the test.
* Downgrade Junit from 4.13.1 to 4.8.1.

# Running the Tests Using Maven

Running `mvn clean test` should run junit and then cause jacoco to produce coverage information in
`target/site/jacoco`.  If the `createMock(...)` line is commented out then it should show `Foo` has 100% covered.  If
if it is not commented then it should show `Foo` as completely uncovered although the "hello" message is emmited.

# Dependencies

* Eclemma 3.1.3 or jacoco-maven-plugin 0.8.6
* apache commons-logging version 1.2
* junit version 4.13.1 (4.8.1 doesn't exhibit this issue)
* easymock version 3.4
