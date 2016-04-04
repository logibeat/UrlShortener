package pt.go2.fileio;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pt.go2.response.AbstractResponse;

/**
 * Helper class for logging user access file
 *
 */
public class AccessLogger {

    private static final Logger LOGGER = LogManager.getLogger("accesslogger");
    
    /**
     * Access log output
     *
     * @param status
     *
     * @param request
     * @param exchange
     * @param exchange
     *
     * @param params
     * @param response
     * @return
     */
    public void log(int status, HttpServletRequest request, final int size) {

        final StringBuilder sb = new StringBuilder();

        sb.append(request.getRemoteAddr());
        sb.append(" - - [");
        sb.append(new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z").format(new Date()));
        sb.append("] \"");
        sb.append(request.getMethod());
        sb.append(" ");
        sb.append(request.getRequestURI());
        sb.append(" ");
        sb.append(request.getProtocol());
        sb.append("\" ");
        sb.append(status);
        sb.append(" ");
        sb.append(size);
        sb.append(" \"");

        final String referer = request.getHeader(AbstractResponse.REQUEST_HEADER_REFERER);

        final String agent = request.getHeader(AbstractResponse.REQUEST_HEADER_USER_AGENT);

        sb.append(referer == null ? "-" : referer);

        sb.append("\" \"" + agent + "\"");

        LOGGER.trace(sb.toString());
    }
}
