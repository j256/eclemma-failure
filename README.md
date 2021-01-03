The following is a small test program that demonstrates a strange issue with Junit, Easymock, and Emma.
Emma is a (usually awesome) coverage tool that runs under eclipse.

See:
	https://stackoverflow.com/questions/65511268/getting-a-no-coverage-data-has-been-collected-using-emma-and-eclipse

When I run junit tests with Emma coverage I get the following error:

	No coverage data has been collected during this coverage Session.
	Please do not terminate the Java process manually from Eclipse.

If you do any of the following the problem goes away:

* You remove the junit timeout.
* Remove the createMock(...)
* Run `createMock(...)` on a more simple object just String or Closeable
* Downgrade Junit from 4.13.1 to 4.8.1.
