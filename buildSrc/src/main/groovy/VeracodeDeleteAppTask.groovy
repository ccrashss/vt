class VeracodeDeleteAppTask extends VeracodeTask {
	static final String NAME = 'veracodeDeleteApp'

	VeracodeDeleteAppTask() {
		description = 'Deletes target application with application id.'
		requiredArguments << 'appId'
	}

	void run() {
		writeXml('build/delete-app.xml', loginUpdate().deleteApp(project.appId))
	}
}