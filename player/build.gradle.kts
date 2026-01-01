val versionOverride = project.findProperty("versionOverride") as? String
version = versionOverride ?: "0.1.0"