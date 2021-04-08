package om.tobias.util;

import java.util.regex.Pattern;

public class CharsetDetector {

    private static final int CHUNK_SIZE = 2000;
    private static Pattern metaPattern = Pattern.compile(
            "<meta\\\\s+([^>]*http-equiv=(\\\"|')?content-type(\\\"|')?[^>]*)>",
            Pattern.CASE_INSENSITIVE
    );


}
