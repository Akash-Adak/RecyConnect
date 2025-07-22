import React from 'react';
import MapComponent from '../components/MapComponent'; // Import the map

const FindServicesPage = () => {
    return (
        <div className="animate-fade-in">
            <div className="text-center mb-8">
                <h1 className="text-4xl font-bold text-gray-800">Find Recycling Services</h1>
                <p className="text-lg text-gray-600 mt-2">Explore nearby NGOs and recyclers on the map.</p>
            </div>
            <MapComponent />
        </div>
    );
};

export default FindServicesPage;