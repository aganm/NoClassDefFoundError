Use run script to execute

```
$ ./run.sh
```

This the output I get
```
[error] (AWT-EventQueue-0) java.lang.NoClassDefFoundError: Bar
[error] java.lang.NoClassDefFoundError: Bar
[error]         at Main$.$anonfun$main$1(Main.scala:11)
[error]         at java.awt.event.InvocationEvent.dispatch(InvocationEvent.java:311)
[error] oclassdeat java.awt.EventQueue.dispatchEventImpl(EventQueue.java:758)
[error]         at java.awt.EventQueue.access$500(EventQueue.java:97)
[error]         at java.awt.EventQueue$3.run(EventQueue.java:709)
[error]         at java.awt.EventQueue$3.run(EventQueue.java:703)
[error]         at java.security.AccessController.doPrivileged(Native Method)
[error]         at java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:74)
[error]         at java.awt.EventQueue.dispatchEvent(EventQueue.java:728)
[error]         at java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:205)
[error]         at java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:116)
[error]         at java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:105)
[error]         at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
[error]         at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:93)
[error]         at java.awt.EventDispatchThread.run(EventDispatchThread.java:82)
[error] Caused by: java.lang.ClassNotFoundException: Bar
[error]         at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
[error]         at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
[error]         at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
[error]         at Main$.$anonfun$main$1(Main.scala:11)
[error]         at java.awt.event.InvocationEvent.dispatch(InvocationEvent.java:311)
[error]         at java.awt.EventQueue.dispatchEventImpl(EventQueue.java:758)
[error]         at java.awt.EventQueue.access$500(EventQueue.java:97)
[error]         at java.awt.EventQueue$3.run(EventQueue.java:709)
[error]         at java.awt.EventQueue$3.run(EventQueue.java:703)
[error]         at java.security.AccessController.doPrivileged(Native Method)
[error]         at java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:74)
[error]         at java.awt.EventQueue.dispatchEvent(EventQueue.java:728)
[error]         at java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:205)
[error]         at java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:116)
[error]         at java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:105)
[error]         at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
[error]         at java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:93)
[error]         at java.awt.EventDispatchThread.run(EventDispatchThread.java:82)
[error] stack trace is suppressed; run last Compile / bgRun for the full output
[success] Total time: 22 s, completed Sep 16, 2019 7:11:25 PM
```
