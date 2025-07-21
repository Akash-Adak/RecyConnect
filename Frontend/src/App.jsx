import React from 'react';
import Navbar from './components/Navbar';
import Footer from './components/Footer';

function App() {
  return (
    <div className="flex flex-col min-h-screen bg-gray-50">
      <Navbar />
      <main className="flex-grow container mx-auto p-6">
        {/* Page content will go here */}
        <h1 className="text-3xl font-bold">Welcome to RecyConnect!</h1>
        <p>Main content area.</p>
      </main>
      <Footer />
    </div>
  );
}

export default App;