<h1>Semaphore Controlled Resource Access</h1>

  <h2>Description</h2>
  <p>This project involves creating a program that controls access to a shared resource using a semaphore. The resource can be accessed by only two threads at a time, ensuring controlled and safe access.</p>

  <h2>Conditions</h2>
  <ol>
      <li>Create a <code>Resource</code> class with a <code>use</code> method that simulates the use of the resource, including message output and delay.</li>
      <li>Create a <code>Worker</code> class that implements <code>Runnable</code>. The <code>run</code> method of this class should attempt to access the resource using a semaphore.</li>
      <li>Instantiate a semaphore with permissions for two threads and multiple worker threads that will attempt to use the resource.</li>
      <li>Ensure that no more than two threads use the resource simultaneously.</li>
  </ol>

  <h2>Requirements</h2>
  <ul>
      <li>Use the <code>Semaphore</code> class from the <code>java.util.concurrent</code> package.</li>
      <li>Demonstrate the correct operation of the semaphore in controlling access to the resource.</li>
  </ul>

  <p class="important">IMPORTANT: Do not change anything except for implementing the <code>run()</code> method in the <code>Worker</code> class and the logic in the <code>use()</code> method in the <code>Resource</code> class.</p>
