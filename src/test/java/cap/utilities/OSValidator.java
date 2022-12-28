package cap.utilities;

public class OSValidator {
	/**
	 * @return
	 */

/**	Using this to get your operating system's name for run time*/
	public static String getOSName() {
		return org.openqa.selenium.Platform.getCurrent().toString();
	}

	/**
	 * @return
	 */
	/**	Using this to get your Windows name for run time*/
	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		// windows
		return (os.indexOf("win") >= 0);

	}

	/**
	 * @return
	 */
	public static boolean isMac() {

		String os = System.getProperty("os.name").toLowerCase();
		// Mac
		return (os.indexOf("mac") >= 0);

	}

	/**
	 * @return
	 */
	public static boolean isUnix() {

		String os = System.getProperty("os.name").toLowerCase();
		// linux or unix
		return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);

	}

	/**
	 * @return
	 */
	public static boolean isSolaris() {

		String os = System.getProperty("os.name").toLowerCase();
		// Solaris
		return (os.indexOf("sunos") >= 0);

	}

	/**
	 * @return
	 */
	public static boolean isLinux32Bit() {
		boolean blResult = false;
		if (System.getProperty("sun.arch.data.model").equalsIgnoreCase("32")) {
			blResult = true;
		}
		return blResult;
	}

	/**
	 * @return
	 */
	public static boolean is32Bit() {
		boolean blResult = false;
		String arch = System.getenv("PROCESSOR_ARCHITECTURE");
		String wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");

		String realArch = arch.endsWith("64") || wow64Arch != null
				&& wow64Arch.endsWith("64") ? "64" : "32";
		System.out.println("OS Version: "+realArch);
		if (realArch.equalsIgnoreCase("32")) {
			blResult = true;
		}
		return blResult;
	}
}
