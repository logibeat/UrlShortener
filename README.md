Url Shortener
============

URL Shortener - Java EE Web Application.

Features
========

- Single War Application;
- Run on Tomcat above 8.0;
- Refuses abusive Phishing and Malware Urls;
- Actively scans short Urls to identify possible threats;
- Slf4j style;
- Integration with Google Webmaster tools, Safebrowsing API and PhishTank API;
- Configurable status redirects;
- Light footprint, can run on very constrained systems.


Get the latest version
======================

The stable version used in production at http://go2.pt is [v0.1.0](https://github.com/vilaca/UrlShortener/releases/tag/v0.1.0).


Server configuration
--------------------

| Field | Default value | Meaning |
|-------|:-------------:|---------|
| server.port | 80 | Port the server will be listening at. |
| server.ip | 0.0.0.0 | Your server IP. |
| server.accessLog | access_log | Access log filename. |
| server.version |  | Version of the server software being run. |
| server.redirect | 301 | HTTP response code for Shortened Urls. Valid values are either 301 or 302. |
| server.cache | 24 | Amount of time (in hours) static pages should be cached. |
| server.domain | | Domain name where site is hosted. |
| database.folder |  | Where to place Url Database files. |
| google-site-verification | | Key used by Google Webmaster tools to confirm site ownership. |
| safe-lookup-api-key | | API key to integrate with Google safe browsing lookup API. |
| phishtank-api-key | | API key to integrate with Phishtank API. |
| watchdog.wait | 5 | Time in seconds Url Watchdog is called after application starts. |
| watchdog.interval | 16 | Time in minute Url Watchdog sleeps. |

Dependencies
============

Apache Commons Validator 1.4.0 - http://commons.apache.org/proper/commons-validator/

Log4j2 - http://logging.apache.org/log4j/2.x/

Tomcat 8 - http://tomcat.apache.org/

License
=======

GNU Affero General Public License.

